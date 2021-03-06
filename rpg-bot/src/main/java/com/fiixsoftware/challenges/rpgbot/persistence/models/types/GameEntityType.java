package com.fiixsoftware.challenges.rpgbot.persistence.models.types;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum GameEntityType
{
	PLAYER("player"),
	NPC("npc"),
	ENEMY("enemy"),
	DOOR("door"),
	ITEM("item"),
	CONSUMABLE("consumable"),
	EQUIPMENT("equipment"),
	CHEST("chest"),
	MOUNT("mount"),
	OBSTACLE("obstacle");

	private String value;
}
