package hu.rycus.tweetwear.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import hu.rycus.tweetwear.R;
import hu.rycus.tweetwear.SyncService;

public class SyncNowItem extends SettingsItem<Void> {

    @Override
    public Void getItem() {
        return null;
    }

    @Override
    protected View createView(final Context context, final ViewGroup parent) {
        return LayoutInflater.from(context).inflate(R.layout.item_sync_now, parent, false);
    }

    @Override
    protected void onClick(final Context context) {
        SyncService.startSync(context);
    }
}
