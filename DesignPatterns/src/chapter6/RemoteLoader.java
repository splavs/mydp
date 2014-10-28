/**
 * 
 */
package chapter6;

/**
 * @author I
 *
 */
public class RemoteLoader {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Light light = new Light("Living room");
		LightOnCommand lightOnCommand = new LightOnCommand(light);
		LightOffCommand lightOffCommand = new LightOffCommand(light);
		
		RemoteControl remoteControl = new RemoteControl(1);
		remoteControl.setCommand(0, lightOnCommand, lightOffCommand);
		
		System.out.println(remoteControl);
		
		remoteControl.onButtonIsPressed(0);
		remoteControl.offButtonIsPressed(0);
		remoteControl.undoButtonIsPressed();
		remoteControl.undoButtonIsPressed();
		remoteControl.undoButtonIsPressed();
		remoteControl.undoButtonIsPressed();

	}

}
