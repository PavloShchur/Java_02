package Zoo_club;


public class Pet {
	private String type_of_pet;
	private String name_of_pet;
	

	public Pet(String type_of_pet, String name_of_pet) {
		super();
		this.type_of_pet = type_of_pet;
		this.name_of_pet = name_of_pet;
	}

	public String getType_of_pet() {
		return type_of_pet;
	}

	public void setType_of_pet(String type_of_pet) {
		this.type_of_pet = type_of_pet;
	}

	public String getName_of_pet() {
		return name_of_pet;
	}

	public void setName_of_pet(String name_of_pet) {
		this.name_of_pet = name_of_pet;
	}

	@Override
	public String toString() {
		return "Pet [type_of_pet=" + type_of_pet + ", name_of_pet=" + name_of_pet + "]";
	}

	public String getValue() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name_of_pet == null) ? 0 : name_of_pet.hashCode());
		result = prime * result + ((type_of_pet == null) ? 0 : type_of_pet.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pet other = (Pet) obj;
		if (name_of_pet == null) {
			if (other.name_of_pet != null)
				return false;
		} else if (!name_of_pet.equals(other.name_of_pet))
			return false;
		if (type_of_pet == null) {
			if (other.type_of_pet != null)
				return false;
		} else if (!type_of_pet.equals(other.type_of_pet))
			return false;
		return true;
	}

	public static Object values() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
