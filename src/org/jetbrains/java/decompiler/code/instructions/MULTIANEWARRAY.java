package org.jetbrains.java.decompiler.code.instructions;

import java.io.DataOutputStream;
import java.io.IOException;

import org.jetbrains.java.decompiler.code.Instruction;

public class MULTIANEWARRAY extends Instruction {

	public void writeToStream(DataOutputStream out, int offset) throws IOException {
		out.writeByte(opc_multianewarray);
		out.writeShort(getOperand(0));
		out.writeByte(getOperand(1));
	}
	
	public int length() {
		return 4;
	}
	
}