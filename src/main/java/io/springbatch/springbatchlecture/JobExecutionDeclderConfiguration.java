//package io.springbatch.springbatchlecture;
//
//import lombok.RequiredArgsConstructor;
//import org.springframework.batch.core.Job;
//import org.springframework.batch.core.Step;
//import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
//import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
//import org.springframework.batch.core.job.flow.JobExecutionDecider;
//import org.springframework.batch.core.launch.support.RunIdIncrementer;
//import org.springframework.batch.repeat.RepeatStatus;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//@RequiredArgsConstructor
//public class JobExecutionDeclderConfiguration {
//
//    private final JobBuilderFactory jobBuilderFactory;
//    private final StepBuilderFactory stepBuilderFactory;
//
//    @Bean
//    public Job job() {
//        return jobBuilderFactory.get("batchJob")
//                .incrementer(new RunIdIncrementer())
//                .start(step())
//                .next(decider())
//                .from(decider()).on("ODD").to(addStep())
//                .from(decider()).on("EVEN").to(eventStep())
//                .end()
//                .build();
//    }
//
//    @Bean
//    public JobExecutionDecider decider() {
//        return new CustomDecider();
//    }
//
//    @Bean
//    public Step step() {
//        return stepBuilderFactory.get("startStep")
//                .tasklet(((stepContribution, chunkContext) -> {
//                    System.out.println("startStep has executor");
//                    return RepeatStatus.FINISHED;
//                }))
//                .build();
//    }
//
//    @Bean
//    public Step eventStep() {
//        return stepBuilderFactory.get("eventStep")
//                .tasklet(((stepContribution, chunkContext) -> {
//                    System.out.println("eventStep has executor");
//                    return RepeatStatus.FINISHED;
//                }))
//                .build();
//    }
//
//    @Bean
//    public Step addStep() {
//        return stepBuilderFactory.get("addStep")
//                .tasklet(((stepContribution, chunkContext) -> {
//                    System.out.println("addStep has executor");
//                    return RepeatStatus.FINISHED;
//                }))
//                .build();
//    }
//}
