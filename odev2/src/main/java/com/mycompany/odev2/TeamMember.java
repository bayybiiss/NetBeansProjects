/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.odev2;

/**
 *
 * @author Excalibur
 */
public abstract class TeamMember implements Runnable{
    public int teamSize;
	protected int sprintCount;
	
	public Thread thread;
	public String threadName;

	public TeamMember(int teamSize, String threadName, int sprintCount) {
		this.teamSize = teamSize;
		this.threadName = threadName;
		this.sprintCount = sprintCount;
	}

	public void start() {
		System.out.println(threadName + " started");
		if (thread == null) {
			thread = new Thread(this, threadName);
			thread.start();
		}
	}

	public abstract void operate();
    
}
