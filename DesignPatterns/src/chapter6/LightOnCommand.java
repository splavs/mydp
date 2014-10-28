/**
 * 
 */
package chapter6;

/**
 * @author I
 *
 */
public class LightOnCommand implements Command {
	Light light;
	
	
	public LightOnCommand(Light light) {
		// TODO Auto-generated constructor stub
		this.light = light;
	
	}

	/* (non-Javadoc)
	 * @see chapter6.Command#execute()
	 */
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		light.switchOn();
	}
	
	@Override
	public void undo() {
		// TODO Auto-generated method stub
		light.switchOff();
		
		
	}

}
