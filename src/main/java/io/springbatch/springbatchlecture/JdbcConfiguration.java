//package io.springbatch.springbatchlecture;
//
//import lombok.RequiredArgsConstructor;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.batch.core.Job;
//import org.springframework.batch.core.Step;
//import org.springframework.batch.core.StepContribution;
//import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
//import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
//import org.springframework.batch.core.job.DefaultJobParametersValidator;
//import org.springframework.batch.core.job.builder.FlowBuilder;
//import org.springframework.batch.core.job.flow.Flow;
//import org.springframework.batch.core.scope.context.ChunkContext;
//import org.springframework.batch.core.step.tasklet.Tasklet;
//import org.springframework.batch.repeat.RepeatStatus;
//import org.springframework.beans.factory.annotation.Configurable;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//@RequiredArgsConstructor
//public class JdbcConfiguration {
//
//    private final JobBuilderFactory jobBuilderFactory;
//    private final StepBuilderFactory stepBuilderFactory;
//
//    @Bean
//    public Job batchJob1() {
//        return this.jobBuilderFactory.get("batchJob1")
//                .start(step1())
//                .next(step2())
//                .next(step3())
////                .validator(new CustomJobParametersValidator())
////                .validator(new DefaultJobParametersValidator(new String[]{"name","date"}, new String[]{"count"}))
////                .preventRestart()
//                .incrementer(new CustomJobParamIncrementer())
//                .build();
//    }
////
////    @Bean
////    public Job batchJob2() {
////        return this.jobBuilderFactory.get("batchJob2")
////                .start(flow())
////                .next(step5())
////                .end()
////                .build();
////    }
//
//    @Bean
//    public Step step1() {
//        return stepBuilderFactory.get("step1")
//                .tasklet((contribution, chunkContext) -> {
//                    System.out.println("step1");
//                    return RepeatStatus.FINISHED;
//                })
//                .build();
//    }
//    @Bean
//    public Step step2() {
//        return stepBuilderFactory.get("step2")
//                .tasklet((contribution, chunkContext) -> {
//                    System.out.println("step2");
////                    throw new RuntimeException("error exception");
//                    return RepeatStatus.FINISHED;
//                })
//                .build();
//    }
//
//    @Bean
//    public Step step3() {
//        return stepBuilderFactory.get("step3")
//                .tasklet((contribution, chunkContext) -> {
//                    System.out.println("step3");
//                    return RepeatStatus.FINISHED;
//                })
//                .build();
//    }
//
////    @Bean
////    public Flow flow() {
////        FlowBuilder<Flow> flowFlowBuilder = new FlowBuilder<>("flow");
////        flowFlowBuilder.start(step3())
////                .next(step4())
////                .end();
////
////        return flowFlowBuilder.build();
////    }
////
////    @Bean
////    public Step step4() {
////        return stepBuilderFactory.get("step4")
////                .tasklet((contribution, chunkContext) -> {
////                    System.out.println("step4");
////                    return RepeatStatus.FINISHED;
////                })
////                .build();
////    }
////
////
////    @Bean
////    public Step step5() {
////        return stepBuilderFactory.get("step5")
////                .tasklet((contribution, chunkContext) -> {
////                    System.out.println("step5");
////                    return RepeatStatus.FINISHED;
////                })
////                .build();
////    }
//}
