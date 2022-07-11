//package io.springbatch.springbatchlecture;
//
//import lombok.RequiredArgsConstructor;
//import org.springframework.batch.core.Job;
//import org.springframework.batch.core.Step;
//import org.springframework.batch.core.StepContribution;
//import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
//import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
//import org.springframework.batch.core.launch.support.RunIdIncrementer;
//import org.springframework.batch.core.scope.context.ChunkContext;
//import org.springframework.batch.core.step.tasklet.Tasklet;
//import org.springframework.batch.item.ItemProcessor;
//import org.springframework.batch.item.ItemWriter;
//import org.springframework.batch.item.support.ListItemReader;
//import org.springframework.batch.repeat.RepeatStatus;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.util.Arrays;
//import java.util.List;
//import java.util.Locale;
//
//@Configuration
//@RequiredArgsConstructor
//public class TaskletStepConfiguration {
//
//    private final JobBuilderFactory jobBuilderFactory;
//    private final StepBuilderFactory stepBuilderFactory;
//
//    @Bean
//    public Job batchJob() {
//        return this.jobBuilderFactory.get("batchJob")
//                .incrementer(new RunIdIncrementer())
//                .start(step1())
//                .build();
//    }
//
//    @Bean
//    public Step step1() {
//        return stepBuilderFactory.get("step1")
//                .tasklet(new Tasklet() {
//                    @Override
//                    public RepeatStatus execute(StepContribution stepContribution, ChunkContext chunkContext) throws Exception {
//                        System.out.println("step1");
////                        throw new RuntimeException("step1 exeception");
//                        return RepeatStatus.FINISHED;
//                    }
//                })
//                .allowStartIfComplete(true)
////                .startLimit(3)
//                .build();
//    }
//
//    @Bean
//    public Step taskJob() {
//        return stepBuilderFactory.get("taskStep")
//                .tasklet(new CustomTasklet())
//                .build();
//    }
//
//    @Bean
//    public Step chunkStep() {
//        return stepBuilderFactory.get("chunkStep")
//                .<String, String>chunk(10)
//                .reader(new ListItemReader<>(Arrays.asList("item1","item2","item3","item4","item5")))
//                .processor(new ItemProcessor<String, String>() {
//                    @Override
//                    public String process(String s) throws Exception {
//                        return s.toUpperCase();
//                    }
//                })
//                .writer(new ItemWriter<String>() {
//                    @Override
//                    public void write(List<? extends String> list) throws Exception {
//                        list.forEach(item -> System.out.println(item));
//                    }
//                }).build();
//    }
//}
