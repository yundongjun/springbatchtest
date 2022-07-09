package io.springbatch.springbatchlecture;

import lombok.RequiredArgsConstructor;
import org.springframework.batch.core.*;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

//@RequiredArgsConstructor
//@Configuration
public class DBJobConfiguration {

//    private final JobBuilderFactory jobBuilderFactory;
//    private final StepBuilderFactory stepBuilderFactory;
//    private final JobExecutionListener jobExecutionListener;

//    private final ExecutionContextTasklet1 executionContextTasklet1;
//    private final ExecutionContextTasklet2 executionContextTasklet2;
//    private final ExecutionContextTasklet3 executionContextTasklet3;
//    private final ExecutionContextTasklet4 executionContextTasklet4;


//    @Bean
//    public Job helloJob() {
//        return this.jobBuilderFactory.get("Job")
//                .start(step1())
//                .next(step2())
////                .next(step3())
////                .next(step4())
//                .listener(jobExecutionListener)
//                .build();
//    }
//
//    @Bean
//    public Step step1() {
//        return stepBuilderFactory.get("step1")
//                .tasklet(new CustomTasklet())
//                .build();
//    }
//    @Bean
//    public Step step2() {
//        return stepBuilderFactory.get("step2")
//                .tasklet((contribution, chunkContext) -> {
//                    System.out.println("step2 has executed");
////                    throw new RuntimeException();
//                    return RepeatStatus.FINISHED;
//                })
//                .build();
//    }
//
//    @Bean
//    public Step step3() {
//        return stepBuilderFactory.get("step3")
//                .tasklet((contribution, chunkContext) -> {
//                    System.out.println("step3 has executed");
//                    return RepeatStatus.FINISHED;
//                })
//                .build();
//    }

//    @Bean
//    public Step step1() {
//        return stepBuilderFactory.get("step1")
//                .tasklet(executionContextTasklet1)
//                .build();
//    }
//    @Bean
//    public Step step2() {
//        return stepBuilderFactory.get("step2")
//                .tasklet(executionContextTasklet2)
//                .build();
//    }
//
//    @Bean
//    public Step step3() {
//        return stepBuilderFactory.get("step3")
//                .tasklet(executionContextTasklet3)
//                .build();
//    }
//
//    @Bean
//    public Step step4() {
//        return stepBuilderFactory.get("step4")
//                .tasklet(executionContextTasklet4)
//                .build();
//    }
}
