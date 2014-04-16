package org.axonframework.samples.trader.infra.bus;


import org.axonframework.commandhandling.annotation.TargetAggregateIdentifier;
import org.axonframework.commandhandling.distributed.AnnotationRoutingStrategy;
import org.axonframework.commandhandling.distributed.CommandBusConnector;
import org.axonframework.commandhandling.distributed.DistributedCommandBus;
import org.axonframework.commandhandling.distributed.UnresolvedRoutingKeyPolicy;

public class DistributedCommandBusExt extends DistributedCommandBus {

	public DistributedCommandBusExt(CommandBusConnector connector) {
		super(connector, new AnnotationRoutingStrategy(TargetAggregateIdentifier.class,UnresolvedRoutingKeyPolicy.STATIC_KEY));
	}

}
