package br.com.ans.job.tasklet;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DownloadArquivosTasklet implements Tasklet {

    @Value("${ans.api.base-url}")
    private String urlAns;

    @Override
    public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {

        Document doc = Jsoup.connect(urlAns).get();

        return RepeatStatus.FINISHED;
    }
}