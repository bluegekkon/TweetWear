package hu.rycus.tweetwear.tasks;

import android.content.Context;

import com.google.android.gms.common.api.GoogleApiClient;

import java.util.Collection;

import hu.rycus.tweetwear.common.api.ApiClientRunnable;
import hu.rycus.tweetwear.common.model.Tweet;
import hu.rycus.tweetwear.common.util.TweetData;

public class ClearExistingTweetsTask extends ApiClientRunnable {

    @Override
    protected void run(final Context context, final GoogleApiClient apiClient) throws Exception {
        final Collection<Tweet> tweets = TweetData.loadAll(apiClient);
        for (final Tweet tweet : tweets) {
            TweetData.of(tweet).deleteBlocking(apiClient);
        }
    }

}
