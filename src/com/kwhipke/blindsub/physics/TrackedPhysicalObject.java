package com.kwhipke.blindsub.physics;

/**
 * Stores the physical state of a physobj.
 * @author Kyle
 *
 */
public class TrackedPhysicalObject {
	private PhysObj trackedObject;
	private Position currentPosition;
	
	public TrackedPhysicalObject(PhysObj trackedObject,Position initialPosition) {
		this.trackedObject = trackedObject;
		this.currentPosition = initialPosition;
	}

	/**
	 * 
	 * @return the velocity vector of the tracked object
	 */
	public VelocityVector getVelocityVector() {
		return trackedObject.getVelocityVector();
	}

	/**
	 * 
	 * @return the position of the tracked object
	 */
	public Position getPosition() {
		return currentPosition;
	}

	/**
	 * 
	 * @param newPosition new position of the tracked object
	 */
	public void setPosition(Position newPosition) {
		this.currentPosition = newPosition;
		
	}

	/**
	 * 
	 * @return the collision model for the tracked object
	 */
	public CollisionBounds getCollisionBounds() {
		return trackedObject.getCollisionBounds();
	}

	/**
	 * Triggers the collision for the tracked physical object
	 * @param other other object to handle a collision with
	 */
	public void doCollision(TrackedPhysicalObject other) {
		// TODO Auto-generated method stub
		
	}
	
}