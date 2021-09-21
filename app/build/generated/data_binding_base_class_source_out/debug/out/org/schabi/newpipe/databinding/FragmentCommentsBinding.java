// Generated by view binder compiler. Do not edit!
package org.schabi.newpipe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
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
import org.schabi.newpipe.views.NewPipeRecyclerView;

public final class FragmentCommentsBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final TextView emptyStateDesc;

  @NonNull
  public final LinearLayout emptyStateView;

  @NonNull
  public final ErrorPanelBinding errorPanel;

  @NonNull
  public final NewPipeRecyclerView itemsList;

  @NonNull
  public final ProgressBar loadingProgressBar;

  private FragmentCommentsBinding(@NonNull RelativeLayout rootView,
      @NonNull TextView emptyStateDesc, @NonNull LinearLayout emptyStateView,
      @NonNull ErrorPanelBinding errorPanel, @NonNull NewPipeRecyclerView itemsList,
      @NonNull ProgressBar loadingProgressBar) {
    this.rootView = rootView;
    this.emptyStateDesc = emptyStateDesc;
    this.emptyStateView = emptyStateView;
    this.errorPanel = errorPanel;
    this.itemsList = itemsList;
    this.loadingProgressBar = loadingProgressBar;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentCommentsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentCommentsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_comments, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentCommentsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.empty_state_desc;
      TextView emptyStateDesc = ViewBindings.findChildViewById(rootView, id);
      if (emptyStateDesc == null) {
        break missingId;
      }

      id = R.id.empty_state_view;
      LinearLayout emptyStateView = ViewBindings.findChildViewById(rootView, id);
      if (emptyStateView == null) {
        break missingId;
      }

      id = R.id.error_panel;
      View errorPanel = ViewBindings.findChildViewById(rootView, id);
      if (errorPanel == null) {
        break missingId;
      }
      ErrorPanelBinding binding_errorPanel = ErrorPanelBinding.bind(errorPanel);

      id = R.id.items_list;
      NewPipeRecyclerView itemsList = ViewBindings.findChildViewById(rootView, id);
      if (itemsList == null) {
        break missingId;
      }

      id = R.id.loading_progress_bar;
      ProgressBar loadingProgressBar = ViewBindings.findChildViewById(rootView, id);
      if (loadingProgressBar == null) {
        break missingId;
      }

      return new FragmentCommentsBinding((RelativeLayout) rootView, emptyStateDesc, emptyStateView,
          binding_errorPanel, itemsList, loadingProgressBar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
