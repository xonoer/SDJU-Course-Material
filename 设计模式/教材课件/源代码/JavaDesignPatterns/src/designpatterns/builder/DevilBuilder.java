//designpatterns.builder.DevilBuilder.java
package designpatterns.builder;

public class DevilBuilder extends ActorBuilder {
	public void buildType() {
		actor.setType("¶ñÄ§");
	}

	public void buildSex() {
		actor.setSex("Ñı");
	}

	public void buildFace() {
		actor.setFace("³óÂª");
	}

	public void buildCostume() {
		actor.setCostume("ºÚÒÂ");
	}

	public void buildHairstyle() {
		actor.setHairstyle("¹âÍ·");
	}	
}