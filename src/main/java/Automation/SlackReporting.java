package Automation;

import com.slack.api.Slack;
import com.slack.api.methods.SlackApiException;
import com.slack.api.methods.request.chat.ChatPostMessageRequest;
import com.slack.api.methods.response.chat.ChatPostMessageResponse;
import java.io.IOException;


public class SlackReporting {

    private static final String SLACK_WEBHOOK_URL = "your_slack_webhook_url";

    public static void sendResultsToSlack(String message) throws IOException, SlackApiException {
        Slack slack = Slack.getInstance();
        ChatPostMessageRequest request = ChatPostMessageRequest.builder()

                //Can change into desired channel to where the report should send
                .channel("#general")
                .text(message)
                .build();

        ChatPostMessageResponse response = slack.methods(SLACK_WEBHOOK_URL).chatPostMessage(request);
        if (!response.isOk()) {
            throw new IOException("Error sending message to Slack: " + response.getError());
        }
    }
}
