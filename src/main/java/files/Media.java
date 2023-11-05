package files;

import java.util.concurrent.TimeUnit;

public class Media extends File {
    private String format;
    private String description;
    private Duration duration;

    public Media(String fileName, long size, String format,
                 String description, long durationInMS) {
        super(fileName, size);
        setFormat(format);
        setDescription(description);
        setDuration(durationInMS);
    }

    public String getFormat() { return format; }
    public String getDescription() { return description; }
    public Duration getDuration() { return duration; }

    public void setFormat(String format) {
        Verification.dataVerification(format);
        this.format = format;
    }
    public void setDescription(String description) {
        Verification.dataVerification(description);
        this.description = description;
    }
    public void setDuration(long duration) {
        Verification.dataVerification(duration);
        this.duration = new Duration(duration);
    }

    @Override
    public void print() {
        super.print();
        if (this instanceof Video) {
            System.out.printf("%s, %s, %s, ", format, description, duration);
        }
        else {
            System.out.printf("%s, %s, %s\n", format, description, duration);
        }
    }

    private static class Duration {
        private long duration; // длительность в миллисекундах

        private Duration(long duration) {
            setDuration(duration);
        }

        private long getDuration() { return duration; }

        private void setDuration(long duration) {
            Verification.dataVerification(duration);
            this.duration = duration;
        }

        public String toString() {
            return String.format("%02d:%02d:%02d", TimeUnit.MILLISECONDS.toHours(duration),
                    TimeUnit.MILLISECONDS.toMinutes(duration)
                            - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(duration)),
                    TimeUnit.MILLISECONDS.toSeconds(duration)
                            - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(duration)));
        }
    }
}