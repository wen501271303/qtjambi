import com.trolltech.qt.*;
import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;
import com.trolltech.qt.xml.*;
import com.trolltech.qt.network.*;
import com.trolltech.qt.sql.*;
import com.trolltech.qt.svg.*;


public class doc_src_i18n {
    public static void main(String args[]) {
        QApplication.initialize(args);
//! [0]
        LoginWidget.LoginWidget()
        {
            QLabel abel = new QLabel(tr("Password:"));
            ...
        }
//! [0]


//! [1]
        void same_static_function()
        {
            QLabel abel = new QLabel(
                        QApplication.instance().translate("LoginWidget", "Password:"));
        }
//! [1]


//! [2]
        StringsFriendlyConversation.greeting(int type)
        {
            static char reeting_strings[] = {
                QT_TR_NOOP("Hello"),
                QT_TR_NOOP("Goodbye")
            };
            return tr(greeting_strings[type]);
        }
//! [2]


//! [3]
        static char reeting_strings[] = {
            QT_TRANSLATE_NOOP("FriendlyConversation", "Hello"),
            QT_TRANSLATE_NOOP("FriendlyConversation", "Goodbye")
        };

        StringsFriendlyConversation.greeting(int type)
        {
            return tr(greeting_strings[type]);
        }

        Stringsglobal_greeting(int type)
        {
            return qApp.translate("FriendlyConversation",
                                   greeting_strings[type]);
        }
//! [3]


//! [4]
        void FileCopier.showProgress(int done, int total,
                                      StringsurrentFile)
        {
            label.setText(tr("%1 of %2 files copied.\nCopying: %3")
                          .arg(done)
                          .arg(total)
                          .arg(currentFile));
        }
//! [4]


//! [5]
        Stringss1 = "%1 of %2 files copied. Copying: %3";
        Stringss2 = "Kopierer nu %3. Av totalt %2 filer er %1 kopiert.";

        qDebug() << s1.arg(5).arg(10).arg("somefile.txt");
        qDebug() << s2.arg(5).arg(10).arg("somefile.txt");
//! [5]


//! [6]
    5 of 10 files copied. Copying: somefile.txt
    Kopierer nu somefile.txt. Av totalt 10 filer er 5 kopiert.
//! [6]


//! [7]
        HEADERS         = funnydialog.h \
                          wackywidget.h
        SOURCES         = funnydialog.cpp \
                          main.cpp \
                          wackywidget.cpp
        FORMS           = fancybox.ui
        TRANSLATIONS    = superapp_dk.ts \
                          superapp_fi.ts \
                          superapp_no.ts \
                          superapp_se.ts
//! [7]


//! [8]
        public static void main(String args[])
        {
            QApplication.initialize(args);

            QTranslator qtTranslator = new QTranslator();
            qtTranslator.load("qt_" + QLocale.system().name());
            QApplication.instance().installTranslator(tTranslator);

            QTranslator myappTranslator = new QTranslator();
            myappTranslator.load("myapp_" + QLocale.system().name());
            QApplication.instance().installTranslator(myappTranslator);

            ...
            QApplication.execStatic();
            QApplication.shutdown();
        }
//! [8]


//! [9]
        Stringsstring = ...; // some Unicode text

        QTextCodec odec = QTextCodec.codecForName("ISO 8859-5");
        QByteArray encodedString = codec.fromUnicode(string);
//! [9]


//! [10]
        QByteArray encodedString = ...; // some ISO 8859-5 encoded text

        QTextCodec odec = QTextCodec.codecForName("ISO 8859-5");
        Stringsstring = codec.toUnicode(encodedString);
//! [10]


//! [11]
        void setTime(QTime ime)
        {
            if (tr("AMPM") == "AMPM") {
                // 12-hour clock
            } else {
                // 24-hour clock
            }
        }
//! [11]


//! [12]
    void changeEvent(QEvent vent)
    {
        if (e.type() == QEvent.Type.LanguageChange) {
            titleLabel.setText(tr("Document Title"));
            ...
            okPushButton.setText(tr("K"));
        } else
            QWidget.changeEvent(event);
    }
//! [12]

//![20]
    exitAct = new QAction(tr("E&xit"), this);
     exitAct.setShortcut(tr("Ctrl+Q"));
//![20]

    }
}
