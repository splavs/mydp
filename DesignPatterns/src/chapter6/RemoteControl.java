/**
 * 
 */
package chapter6;

import java.util.*;

/**
 * @author I
 *
 */
public class RemoteControl {
	Command[] onCommands;
	Command[] offCommands;
	int nOfControls;
	Stack<Command> undoCommand = new Stack<Command>();
	
	public RemoteControl(int nOfControls) {
		// TODO Auto-generated constructor stub
		this.nOfControls = nOfControls;
		NoCommand noCommand = new NoCommand();
		onCommands = new Command[nOfControls];
		offCommands = new Command[nOfControls];
		
		for (int i = 0; i < nOfControls; i++) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
		
	}
	
	public boolean setCommand(int slot, Command onCommand, Command offCommand) {
		if ( (slot < nOfControls) && (slot >= 0) ) {
			onCommands[slot] = onCommand;
			offCommands[slot] = offCommand;
			return true;
		}
		
		return false;
	}
	
	public void onButtonIsPressed(int slot) {
		if ( (slot < nOfControls) && (slot >= 0) ) {
			onCommands[slot].execute();
			undoCommand.push(onCommands[slot]);
		}
	}

	public void offButtonIsPressed(int slot) {
		if ( (slot < nOfControls) && (slot >= 0) ) {
			offCommands[slot].execute();
			undoCommand.push(offCommands[slot]);
		}
	}
	
	public void undoButtonIsPressed() {
		try {
			undoCommand.pop().undo();
		} catch (EmptyStackException e) {
			System.out.println("Nothing to undo");
		}
	}
	
	
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("\nRemote control\n");
		for (int i = 0; i < nOfControls; i++) {
			sb.append("[slot " + i +" ]" + onCommands[i].getClass().getName() + " " 
		+ offCommands[i].getClass().getName() + "\n");
		}
		return sb.toString();
	}
	

}
