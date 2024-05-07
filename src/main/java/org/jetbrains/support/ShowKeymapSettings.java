package org.jetbrains.support;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.keymap.impl.ui.KeymapPanel;
import com.intellij.openapi.options.ShowSettingsUtil;

public class ShowKeymapSettings extends AnAction {
  public ShowKeymapSettings() {
    super("Show Keymap Settings");
  }
  
  @Override
  public void actionPerformed(AnActionEvent e) {
    ShowSettingsUtil.getInstance().showSettingsDialog(e.getProject(), KeymapPanel.class);
  }
}