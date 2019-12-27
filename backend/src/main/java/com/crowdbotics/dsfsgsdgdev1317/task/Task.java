package com.crowdbotics.dsfsgsdgdev1317.task;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Getter
@NoArgsConstructor
@Setter
@Entity
public class Task 
{

	public Task(
		final String _description
	) 
	{
		description = _description;
	}

	/**
	 * <h1>ID</h1>
	 * 
	 * <p>Internal ID for the task.</p>
	 */
    @Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id;

	private String description;



}
