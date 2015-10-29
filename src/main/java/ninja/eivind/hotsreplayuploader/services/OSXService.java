package ninja.eivind.hotsreplayuploader.services;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.URI;

public class OSXService implements PlatformService {
    private Desktop desktop;

    public OSXService() {
       desktop = Desktop.getDesktop();
    }

    @Override
    public File getApplicationHome() {
        return null;
    }

    @Override
    public File getHotSHome() {
        return null;
    }

    @Override
    public void browse(final URI uri) throws IOException {
        desktop.browse(uri);
    }
}
