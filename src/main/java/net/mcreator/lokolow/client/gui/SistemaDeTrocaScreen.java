package net.mcreator.lokolow.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.lokolow.world.inventory.SistemaDeTrocaMenu;
import net.mcreator.lokolow.network.SistemaDeTrocaButtonMessage;
import net.mcreator.lokolow.LokolowMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class SistemaDeTrocaScreen extends AbstractContainerScreen<SistemaDeTrocaMenu> {
	private final static HashMap<String, Object> guistate = SistemaDeTrocaMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_empty;
	Button button_empty1;

	public SistemaDeTrocaScreen(SistemaDeTrocaMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 182;
		this.imageHeight = 187;
	}

	private static final ResourceLocation texture = new ResourceLocation("lokolow:textures/screens/sistema_de_troca.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.lokolow.sistema_de_troca.label_empty"), 61, 49, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.lokolow.sistema_de_troca.label_capitalizar"), 15, 33, -12829636, false);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		button_empty = Button.builder(Component.translatable("gui.lokolow.sistema_de_troca.button_empty"), e -> {
			if (true) {
				LokolowMod.PACKET_HANDLER.sendToServer(new SistemaDeTrocaButtonMessage(0, x, y, z));
				SistemaDeTrocaButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 113, this.topPos + 69, 30, 20).build();
		guistate.put("button:button_empty", button_empty);
		this.addRenderableWidget(button_empty);
		button_empty1 = Button.builder(Component.translatable("gui.lokolow.sistema_de_troca.button_empty1"), e -> {
			if (true) {
				LokolowMod.PACKET_HANDLER.sendToServer(new SistemaDeTrocaButtonMessage(1, x, y, z));
				SistemaDeTrocaButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 113, this.topPos + 22, 30, 20).build();
		guistate.put("button:button_empty1", button_empty1);
		this.addRenderableWidget(button_empty1);
	}
}
