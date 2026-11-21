package net.mcreator.lokolow.client.gui;

import net.neoforged.neoforge.client.network.ClientPacketDistributor;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.Identifier;
import net.minecraft.network.chat.Component;
import net.minecraft.client.renderer.RenderPipelines;
import net.minecraft.client.input.KeyEvent;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphicsExtractor;

import net.mcreator.lokolow.world.inventory.SistemaDeTrocaMenu;
import net.mcreator.lokolow.network.SistemaDeTrocaButtonMessage;
import net.mcreator.lokolow.init.LokolowModScreens;

import com.mojang.blaze3d.platform.InputConstants;

public class SistemaDeTrocaScreen extends AbstractContainerScreen<SistemaDeTrocaMenu> implements LokolowModScreens.ScreenAccessor {
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	private boolean menuStateUpdateActive = false;
	private Button button_empty;
	private Button button_empty1;
	private static final Identifier BACKGROUND = Identifier.parse("lokolow:textures/screens/sistema_de_troca.png");

	public SistemaDeTrocaScreen(SistemaDeTrocaMenu container, Inventory inventory, Component text) {
		super(container, inventory, text, 182, 187);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
	}

	@Override
	public void updateMenuState(int elementType, String name, Object elementState) {
		menuStateUpdateActive = true;
		menuStateUpdateActive = false;
	}

	@Override
	public void extractRenderState(GuiGraphicsExtractor guiGraphics, int mouseX, int mouseY, float partialTicks) {
		super.extractRenderState(guiGraphics, mouseX, mouseY, partialTicks);
	}

	@Override
	public void extractBackground(GuiGraphicsExtractor guiGraphics, int mouseX, int mouseY, float partialTicks) {
		super.extractBackground(guiGraphics, mouseX, mouseY, partialTicks);
		guiGraphics.blit(RenderPipelines.GUI_TEXTURED, BACKGROUND, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
	}

	@Override
	public boolean keyPressed(KeyEvent event) {
		int key = InputConstants.getKey(event).getValue();
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(event);
	}

	@Override
	protected void extractLabels(GuiGraphicsExtractor guiGraphics, int mouseX, int mouseY) {
		guiGraphics.text(this.font, Component.translatable("gui.lokolow.sistema_de_troca.label_empty"), 61, 49, -12829636, false);
		guiGraphics.text(this.font, Component.translatable("gui.lokolow.sistema_de_troca.label_capitalizar"), 15, 33, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_empty = Button.builder(Component.translatable("gui.lokolow.sistema_de_troca.button_empty"), e -> {
			int x = SistemaDeTrocaScreen.this.x;
			int y = SistemaDeTrocaScreen.this.y;
			if (true) {
				ClientPacketDistributor.sendToServer(new SistemaDeTrocaButtonMessage(0, x, y, z));
				SistemaDeTrocaButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 113, this.topPos + 69, 30, 20).build();
		this.addRenderableWidget(button_empty);
		button_empty1 = Button.builder(Component.translatable("gui.lokolow.sistema_de_troca.button_empty1"), e -> {
			int x = SistemaDeTrocaScreen.this.x;
			int y = SistemaDeTrocaScreen.this.y;
			if (true) {
				ClientPacketDistributor.sendToServer(new SistemaDeTrocaButtonMessage(1, x, y, z));
				SistemaDeTrocaButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 113, this.topPos + 22, 30, 20).build();
		this.addRenderableWidget(button_empty1);
	}
}