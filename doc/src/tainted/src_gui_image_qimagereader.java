/*   Ported from: src.gui.image.qimagereader.cpp
<snip>
//! [0]
        QImageReader reader;
        reader.setFormat("png"); // same as reader.setFormat("PNG");
//! [0]


//! [1]
        QImageReader reader("image.png");
        // reader.format() == "png"
//! [1]


//! [2]
        QImage icon(64, 64, QImage::Format_RGB32);
        QImageReader reader("icon_64x64.bmp");
        if (reader.read(&icon)) {
            // Display icon
        }
//! [2]


//! [3]
        QImageReader reader(":/image.png");
        if (reader.supportsOption(QImageIOHandler::Size))
            qDebug() << "Size:" << reader.size();
//! [3]


</snip>
*/
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
//! [0]
        QImageReader reader;
        reader.setFormat("png"); // same as reader.setFormat("PNG");
//! [0]


//! [1]
        QImageReader reader("image.png");
        // reader.format() == "png"
//! [1]


//! [2]
        QImage icon(64, 64, QImage.Format_RGB32);
        QImageReader reader("icon_64x64.bmp");
        if (reader.read(con)) {
            // Display icon
        }
//! [2]


//! [3]
        QImageReader reader(":/image.png");
        if (reader.supportsOption(QImageIOHandler.Size))
            qDebug() << "Size:" << reader.size();
//! [3]


    }
}