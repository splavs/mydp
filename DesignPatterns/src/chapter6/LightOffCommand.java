/**
 * 
 */
package chapter6;

/**
 * @author I
 *
 */
public class LightOffCommand implements Command {
	Light light;
	
	public LightOffCommand(Light light) {
		// TODO Auto-generated constructor stub
		this.light = light;
	}

	/* (non-Javadoc)
	 * @see chapter6.Command#execute()
	 */
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		light.switchOff();
	}
	
	@Override
	public void undo() {
		// TODO Auto-generated method stub
		light.switchOn();
		
	}

}
