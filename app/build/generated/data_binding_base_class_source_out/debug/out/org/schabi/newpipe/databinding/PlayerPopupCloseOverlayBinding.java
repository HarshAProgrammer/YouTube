// Generated by view binder compiler. Do not edit!
package org.schabi.newpipe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.schabi.newpipe.R;

public final class PlayerPopupCloseOverlayBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final FloatingActionButton closeButton;

  private PlayerPopupCloseOverlayBinding(@NonNull FrameLayout rootView,
      @NonNull FloatingActionButton closeButton) {
    this.rootView = rootView;
    this.closeButton = closeButton;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static PlayerPopupCloseOverlayBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static PlayerPopupCloseOverlayBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.player_popup_close_overlay, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static PlayerPopupCloseOverlayBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.closeButton;
      FloatingActionButton closeButton = ViewBindings.findChildViewById(rootView, id);
      if (closeButton == null) {
        break missingId;
      }

      return new PlayerPopupCloseOverlayBinding((FrameLayout) rootView, closeButton);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
