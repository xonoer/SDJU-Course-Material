//designpatterns.builder.ActorController.java
package designpatterns.builder;

public class ActorController {
    //逐步构建复杂产品对象
	public Actor construct(ActorBuilder ab) {
		Actor actor;
		ab.buildType();
		ab.buildSex();
		ab.buildFace();
		ab.buildCostume();
		ab.buildHairstyle();
		actor=ab.createActor();
		return actor;
	}
}