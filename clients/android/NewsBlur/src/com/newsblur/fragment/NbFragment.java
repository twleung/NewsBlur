package com.newsblur.fragment;

import android.app.Activity;
import android.content.Intent;
import android.support.v4.app.Fragment;

import com.newsblur.service.NBSyncService;

public class NbFragment extends Fragment {

    /**
     * Pokes the sync service to perform any pending sync actions.
     */
    protected void triggerSync() {
        Activity a = getActivity();
        if (a != null) {
            Intent i = new Intent(a, NBSyncService.class);
            a.startService(i);
        }
	}

}
