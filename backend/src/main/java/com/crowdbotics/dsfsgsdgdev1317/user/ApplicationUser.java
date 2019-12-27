package com.crowdbotics.dsfsgsdgdev1317.user;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * <h1>Application User</h1>
 *
 * <p>...</p>
 *
 * @author crowdbotics.com
 */
@Getter
@NoArgsConstructor
@Setter
@Entity
public class ApplicationUser 
{

	/**
	 * <h1>ID</h1>
	 * 
	 * <p>Internal ID for the user.</p>
	 */
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	private Long id;

	private String username;

	private String password;


}
