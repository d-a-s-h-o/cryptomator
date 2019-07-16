package org.cryptomator.ui.mainwindow;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.ReadOnlyObjectProperty;
import org.cryptomator.ui.FxApplicationScoped;
import org.cryptomator.ui.FxController;
import org.cryptomator.ui.model.Vault;

import javax.inject.Inject;

@FxApplicationScoped
public class VaultDetailController implements FxController {
	
	private final ReadOnlyObjectProperty<Vault> vault;

	@Inject
	VaultDetailController(ObjectProperty<Vault> vault) {
		this.vault = vault;
	}

	public ReadOnlyObjectProperty<Vault> vaultProperty() {
		return vault;
	}
	
	public Vault getVault() {
		return vault.get();
	}

}
