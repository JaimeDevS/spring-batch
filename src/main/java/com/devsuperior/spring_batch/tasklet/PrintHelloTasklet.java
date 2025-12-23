package com.devsuperior.spring_batch.tasklet;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import jakarta.annotation.Nullable;

@Component
@StepScope
public class PrintHelloTasklet implements Tasklet {

	//@Value("${name}")
	@Value("#{jobParameters['name']}")
	private String name;
	
	@Override
	public @Nullable RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
		System.out.println("Olá " + name + "!");
		return RepeatStatus.FINISHED;
	}

}
