package ch12._01_enum._03;

public enum CarEnum {
	BMW("bmw"), TOYOTA("tOYOTA"), FIAT("FiAt"), AUDI("AUDI");
	private String carType;
	private CarEnum(String carType) {
		this.carType = carType;
	}
	public String toString() {
		// �N�Ĥ@�Ӧr���j�g�A��l�r���p�g
		return carType.substring(0, 1).toUpperCase() + 
				carType.substring(1).toLowerCase(); 
	}
}

