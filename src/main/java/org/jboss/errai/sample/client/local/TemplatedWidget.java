package org.jboss.errai.sample.client.local;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.jboss.errai.ui.nav.client.local.DefaultPage;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.EventHandler;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.TextBox;

@Templated
@Page(role = DefaultPage.class)
public class TemplatedWidget extends Composite {

  @Inject @DataField 
  private TextBox name;
  
  @Inject @DataField 
  private Button hello;
  
  @EventHandler("hello")
  private void onHello(ClickEvent e) {
    Window.alert("Hello " + name.getText() + "!");
  }
  
}
