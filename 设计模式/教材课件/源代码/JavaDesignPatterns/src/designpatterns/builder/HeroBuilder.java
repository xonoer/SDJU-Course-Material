//designpatterns.builder.HeroBuilder.java
package designpatterns.builder;

public class HeroBuilder extends ActorBuilder {
	public void buildType() {
		actor.setType("Ó¢ÐÛ");
	}

	public void buildSex() {
		actor.setSex("ÄÐ");
	}

	public void buildFace() {
		actor.setFace("Ó¢¿¡");
	}

	public void buildCostume() {
		actor.setCostume("¿ø¼×");
	}

	public void buildHairstyle() {
		actor.setHairstyle("Æ®ÒÝ");
	}	
}