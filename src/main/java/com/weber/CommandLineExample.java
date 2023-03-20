package com.weber;


import org.jline.reader.LineReader;
import org.jline.reader.LineReader.Option;
import org.jline.reader.LineReaderBuilder;
import org.jline.reader.impl.completer.StringsCompleter;
import org.jline.terminal.Terminal;
import org.jline.terminal.TerminalBuilder;


public class CommandLineExample {
    public static void main(String[] args) throws Exception {
        // Create a Terminal instance
        Terminal terminal = TerminalBuilder.terminal();

        // Create a LineReader instance with candidate list completion
        LineReader reader = LineReaderBuilder.builder()
                .terminal(terminal)
                .completer(new StringsCompleter("command1", "command2", "arg1", "arg2"))
                .option(LineReader.Option.CASE_INSENSITIVE, true)
                .option(Option.AUTO_FRESH_LINE, true)
                .option(Option.DISABLE_EVENT_EXPANSION, true)
                .build();

        // Read user input and process it
        String line;
        while ((line = reader.readLine("> ")) != null) {
            System.out.println("You entered: " + line);
        }
    }
}
