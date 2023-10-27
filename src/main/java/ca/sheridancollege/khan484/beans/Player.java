package ca.sheridancollege.khan484.beans;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Player {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String unitclass;
	private String[] unitclasses = { "Sniper", "Medic", "Scout", "Soldier", "Demoman", "Heavy Weapons", "Pyro", "Spy",
			"Engineer" };
}