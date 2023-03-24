package com.weber;

import org.jline.reader.LineReader;
import org.jline.reader.LineReaderBuilder;
import org.jline.reader.impl.completer.StringsCompleter;
import org.jline.terminal.Terminal;
import org.jline.terminal.TerminalBuilder;

import java.io.*;
;

public class CmdExample {
    public static void main(String[] args) throws IOException {
        /*TerminalBuilder builder = TerminalBuilder.builder();
        Terminal terminal = builder.build();
        LineReader reader = LineReaderBuilder.builder()
                .terminal(terminal)
                .completer(new StringsCompleter("command1", "command2"))
                .build();
        String prompt = "cmd> ";
        String line;
        while ((line = reader.readLine(prompt)) != null) {
            System.out.println("You entered: " + line);
        }*/
    }
}
