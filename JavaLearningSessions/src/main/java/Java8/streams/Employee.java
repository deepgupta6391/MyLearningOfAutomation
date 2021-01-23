package Java8.streams;

import java.util.HashSet;
import java.util.Set;

public class Employee {
	private String name;
	private int age;
	private Set<String> devices;

	public Employee(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Employee(String name, Set<String> devices) {
		this.name = name;
		this.devices = devices;
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public void addDevices(String deviceName) {
		if (this.devices == null) {
			this.devices = new HashSet<>();
		}
		this.devices.add(deviceName);
	}

	public Set<String> getDevices() {
		return devices;
	}

	public void setDevices(Set<String> devices) {
		this.devices = devices;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String toString() {
		return "Employee Name: " + name + " age: " + age;
	}
}
