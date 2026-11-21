package net.mcreator.lokolow.network;

import net.neoforged.neoforge.network.handling.IPayloadContext;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.resources.Identifier;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.network.protocol.PacketFlow;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.chat.Component;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.core.SectionPos;

import net.mcreator.lokolow.procedures.ProximoitemProcedure;
import net.mcreator.lokolow.procedures.AnteriorItemProcedure;
import net.mcreator.lokolow.LokolowMod;

@EventBusSubscriber
public record SistemaDeTrocaButtonMessage(int buttonID, int x, int y, int z) implements CustomPacketPayload {
	public static final Type<SistemaDeTrocaButtonMessage> TYPE = new Type<>(Identifier.fromNamespaceAndPath(LokolowMod.MODID, "sistema_de_troca_buttons"));
	public static final StreamCodec<RegistryFriendlyByteBuf, SistemaDeTrocaButtonMessage> STREAM_CODEC = StreamCodec.of((RegistryFriendlyByteBuf buffer, SistemaDeTrocaButtonMessage message) -> {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}, (RegistryFriendlyByteBuf buffer) -> new SistemaDeTrocaButtonMessage(buffer.readInt(), buffer.readInt(), buffer.readInt(), buffer.readInt()));

	@Override
	public Type<SistemaDeTrocaButtonMessage> type() {
		return TYPE;
	}

	public static void handleData(final SistemaDeTrocaButtonMessage message, final IPayloadContext context) {
		if (context.flow() == PacketFlow.SERVERBOUND) {
			context.enqueueWork(() -> handleButtonAction(context.player(), message.buttonID, message.x, message.y, message.z)).exceptionally(e -> {
				context.connection().disconnect(Component.literal(e.getMessage()));
				return null;
			});
		}
	}

	public static void handleButtonAction(Player entity, int buttonID, int x, int y, int z) {
		Level world = entity.level();
		// security measure to prevent arbitrary chunk generation
		if (!world.getChunkSource().hasChunk(SectionPos.blockToSectionCoord(x), SectionPos.blockToSectionCoord(z)))
			return;
		if (buttonID == 0) {

			ProximoitemProcedure.execute(entity);
		}
		if (buttonID == 1) {

			AnteriorItemProcedure.execute(entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		LokolowMod.addNetworkMessage(SistemaDeTrocaButtonMessage.TYPE, SistemaDeTrocaButtonMessage.STREAM_CODEC, SistemaDeTrocaButtonMessage::handleData);
	}
}