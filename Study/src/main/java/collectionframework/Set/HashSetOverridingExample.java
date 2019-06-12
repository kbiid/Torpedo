package collectionframework.Set;

import java.util.HashSet;

public class HashSetOverridingExample {

	public static void main(String[] args) {
		HashSet<Animal> hashSet = new HashSet<>();

		hashSet.add(new Animal("고양이", "육지"));
		hashSet.add(new Animal("고양이", "육지"));
		hashSet.add(new Animal("고양이", "육지"));

		System.out.println(hashSet.size());
	}
}

class Animal {
	private String species;
	private String habitat;

	public Animal(String species, String habitat) {
		this.species = species;
		this.habitat = habitat;
	}

	public int hashCode() {
		return (species + habitat).hashCode();
	}

	public boolean equals(Object obj) {
		if (obj instanceof Animal) {
			Animal temp = (Animal) obj;
			return species.equals(temp.species) && habitat.equals(temp.habitat);
		} else {
			return false;
		}
	}
}
