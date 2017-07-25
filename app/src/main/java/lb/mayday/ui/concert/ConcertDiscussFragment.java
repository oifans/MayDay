package lb.mayday.ui.concert;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import lb.mayday.R;

/**
 * Created by Administrator on 2017/7/25.
 */

public class ConcertDiscussFragment extends Fragment {

    View rootView;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_concert_discuss, container, false);
        return rootView;
    }
}
