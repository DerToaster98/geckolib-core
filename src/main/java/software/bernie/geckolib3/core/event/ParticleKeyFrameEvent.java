package software.bernie.geckolib3.core.event;

import software.bernie.geckolib3.core.engine.AnimationChannel;

public class ParticleKeyFrameEvent<T> extends KeyframeEvent<T> {
	public final String effect;
	public final String locator;
	public final String script;

	/**
	 * This stores all the fields that are needed in the AnimationTestEvent
	 *
	 * @param animationTick The amount of ticks that have passed in either the current transition or animation, depending on the controller's AnimationState.
	 * @param controller    the controller
	 */
	public ParticleKeyFrameEvent(double animationTick, String effect, String locator, String script,
			AnimationChannel<T> controller) {
		super(animationTick, controller);
		this.effect = effect;
		this.locator = locator;
		this.script = script;
	}
}
