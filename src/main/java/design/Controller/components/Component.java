package design.Controller.components;

import design.Controller.mediator.Mediator;

public interface Component {
    void setMediator(Mediator mediator);
    String getName();
}
