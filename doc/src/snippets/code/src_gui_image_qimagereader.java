import com.trolltech.qt.*;
import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;
import com.trolltech.qt.xml.*;
import com.trolltech.qt.network.*;
import com.trolltech.qt.sql.*;
import com.trolltech.qt.svg.*;


public class src_gui_image_qimagereader {
    public static void main(String args[]) {
        QApplication.initialize(args);
        {
//! [0]
        QImageReader reader = new QImageReader();
        reader.setFormat(new QByteArray("png")); // same as reader.setFormat("PNG");
//! [0]
        }

        {
//! [1]
        QImageReader reader = new QImageReader("image.png");
        // reader.format() == "png"
//! [1]
        }

        {
//! [2]
        QImageReader reader = new QImageReader("icon_64x64.bmp");
        QImage icon = reader.read();
        if (!icon.isNull()) {
            // Display icon
        }
//! [2]
        }

//! [3]
        QImageReader reader = new QImageReader("classpath:/image.png");
        if (reader.supportsOption(QImageIOHandler.ImageOption.Size))
            System.err.println("Size: " + reader.size());
//! [3]


    }
}
