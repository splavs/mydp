/**
 * 
 */
package chapter6;

/**
 * @author I
 *
 */
public class Light {
	String room;
	
	public Light(String room) {
		// TODO Auto-generated constructor stub
		this.room = room;
	}
		
	
	public void switchOn() {
		System.out.println("Light is switched on in the " + room);
	}

	public void switchOff() {
		System.out.println("Light is switched off in the " + room);
	}

}
