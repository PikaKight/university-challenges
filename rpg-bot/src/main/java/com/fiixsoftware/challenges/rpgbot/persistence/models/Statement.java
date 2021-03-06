package com.fiixsoftware.challenges.rpgbot.persistence.models;

import com.fiixsoftware.challenges.rpgbot.persistence.models.types.StatementType;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Statement
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(nullable = false)
	private StatementType statementType;

	@Column(nullable = false)
	private String message;
}
