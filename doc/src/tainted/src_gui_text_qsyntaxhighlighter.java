/*   Ported from: src.gui.text.qsyntaxhighlighter.cpp
<snip>
//! [0]
           QTextEdit *editor = new QTextEdit;
           MyHighlighter *highlighter = new MyHighlighter(editor->document());
//! [0]


//! [1]
        void MyHighlighter::highlightBlock(const QString &text)
        {
            QTextCharFormat myClassFormat;
            myClassFormat.setFontWeight(QFont::Bold);
            myClassFormat.setForeground(Qt::darkMagenta);
            QString pattern = "\\bMy[A-Za-z]+\\b";

            QRegExp expression(pattern);
            int index = text.indexOf(expression);
            while (index >= 0) {
                int length = expression.matchedLength();
                setFormat(index, length, myClassFormat);
                index = text.indexOf(expression, index + length);
             }
         }
//! [1]


//! [2]
        QTextCharFormat multiLineCommentFormat;
        multiLineCommentFormat.setForeground(Qt::red);

        QRegExp startExpression("/\\*");
        QRegExp endExpression("\\* /");

        setCurrentBlockState(0);

        int startIndex = 0;
        if (previousBlockState() != 1)
            startIndex = text.indexOf(startExpression);

        while (startIndex >= 0) {
           int endIndex = text.indexOf(endExpression, startIndex);
           int commentLength;
           if (endIndex == -1) {
               setCurrentBlockState(1);
               commentLength = text.length() - startIndex;
           } else {
               commentLength = endIndex - startIndex
                               + endExpression.matchedLength();
           }
           setFormat(startIndex, commentLength, multiLineCommentFormat);
           startIndex = text.indexOf(startExpression,
                                     startIndex + commentLength);
        }
//! [2]


//! [3]
        void MyHighlighter::highlightBlock(const QString &text)
        {
            QTextCharFormat myClassFormat;
            myClassFormat.setFontWeight(QFont::Bold);
            myClassFormat.setForeground(Qt::darkMagenta);
            QString pattern = "\\bMy[A-Za-z]+\\b";

            QRegExp expression(pattern);
            int index = text.indexOf(expression);
            while (index >= 0) {
                int length = expression.matchedLength();
                setFormat(index, length, myClassFormat);
                index = text.indexOf(expression, index + length);
             }
         }
//! [3]


//! [4]
        struct ParenthesisInfo
        {
            QChar char;
            int position;
        };

        struct BlockData : public QTextBlockUserData
        {
            QVector<ParenthesisInfo> parentheses;
        };
//! [4]


</snip>
*/
import com.trolltech.qt.*;
import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;
import com.trolltech.qt.xml.*;
import com.trolltech.qt.network.*;
import com.trolltech.qt.sql.*;
import com.trolltech.qt.svg.*;


public class src_gui_text_qsyntaxhighlighter {
    public static void main(String args[]) {
        QApplication.initialize(args);
//! [0]
           QTextEdit ditor = new QTextEdit;
           MyHighlighter ighlighter = new MyHighlighter(editor.document());
//! [0]


//! [1]
        void MyHighlighter.highlightBlock(Stringsext)
        {
            QTextCharFormat myClassFormat;
            myClassFormat.setFontWeight(QFont.Bold);
            myClassFormat.setForeground(Qt.darkMagenta);
            Stringspattern = "\\bMy[A-Za-z]+\\b";

            QRegExp expression(pattern);
            int index = text.indexOf(expression);
            while (index >= 0) {
                int length = expression.matchedLength();
                setFormat(index, length, myClassFormat);
                index = text.indexOf(expression, index + length);
             }
         }
//! [1]


//! [2]
        QTextCharFormat multiLineCommentFormat;
        multiLineCommentFormat.setForeground(Qt.red);

        QRegExp startExpression("/\\*");
        QRegExp endExpression("\\* /");

        setCurrentBlockState(0);

        int startIndex = 0;
        if (previousBlockState() != 1)
            startIndex = text.indexOf(startExpression);

        while (startIndex >= 0) {
           int endIndex = text.indexOf(endExpression, startIndex);
           int commentLength;
           if (endIndex == -1) {
               setCurrentBlockState(1);
               commentLength = text.length() - startIndex;
           } else {
               commentLength = endIndex - startIndex
                               + endExpression.matchedLength();
           }
           setFormat(startIndex, commentLength, multiLineCommentFormat);
           startIndex = text.indexOf(startExpression,
                                     startIndex + commentLength);
        }
//! [2]


//! [3]
        void MyHighlighter.highlightBlock(Stringsext)
        {
            QTextCharFormat myClassFormat;
            myClassFormat.setFontWeight(QFont.Bold);
            myClassFormat.setForeground(Qt.darkMagenta);
            Stringspattern = "\\bMy[A-Za-z]+\\b";

            QRegExp expression(pattern);
            int index = text.indexOf(expression);
            while (index >= 0) {
                int length = expression.matchedLength();
                setFormat(index, length, myClassFormat);
                index = text.indexOf(expression, index + length);
             }
         }
//! [3]


//! [4]
        struct ParenthesisInfo
        {
            QChar char;
            int position;
        };

        struct BlockData : public QTextBlockUserData
        {
            QVector<ParenthesisInfo> parentheses;
        };
//! [4]


    }
}