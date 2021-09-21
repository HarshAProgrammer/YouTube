// Generated by view binder compiler. Do not edit!
package org.schabi.newpipe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.schabi.newpipe.R;

public final class StatisticPlaylistControlBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final PlaylistControlBinding playlistControl;

  @NonNull
  public final RelativeLayout sortButton;

  @NonNull
  public final ImageView sortButtonIcon;

  @NonNull
  public final TextView sortButtonText;

  private StatisticPlaylistControlBinding(@NonNull LinearLayout rootView,
      @NonNull PlaylistControlBinding playlistControl, @NonNull RelativeLayout sortButton,
      @NonNull ImageView sortButtonIcon, @NonNull TextView sortButtonText) {
    this.rootView = rootView;
    this.playlistControl = playlistControl;
    this.sortButton = sortButton;
    this.sortButtonIcon = sortButtonIcon;
    this.sortButtonText = sortButtonText;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static StatisticPlaylistControlBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static StatisticPlaylistControlBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.statistic_playlist_control, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static StatisticPlaylistControlBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.playlist_control;
      View playlistControl = ViewBindings.findChildViewById(rootView, id);
      if (playlistControl == null) {
        break missingId;
      }
      PlaylistControlBinding binding_playlistControl = PlaylistControlBinding.bind(playlistControl);

      id = R.id.sortButton;
      RelativeLayout sortButton = ViewBindings.findChildViewById(rootView, id);
      if (sortButton == null) {
        break missingId;
      }

      id = R.id.sortButtonIcon;
      ImageView sortButtonIcon = ViewBindings.findChildViewById(rootView, id);
      if (sortButtonIcon == null) {
        break missingId;
      }

      id = R.id.sortButtonText;
      TextView sortButtonText = ViewBindings.findChildViewById(rootView, id);
      if (sortButtonText == null) {
        break missingId;
      }

      return new StatisticPlaylistControlBinding((LinearLayout) rootView, binding_playlistControl,
          sortButton, sortButtonIcon, sortButtonText);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
