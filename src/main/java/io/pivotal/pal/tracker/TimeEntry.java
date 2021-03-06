package io.pivotal.pal.tracker;

import java.time.LocalDate;

public class TimeEntry {
    private long id;
    private long projectId;
    private long userId;
    private LocalDate date;
    private int hours;

    public TimeEntry(long projectId, long userId, LocalDate entryDate, int hours) {
        this.setProjectId(projectId);
        this.setUserId(userId);
        this.setDate(entryDate);
        this.setHours(hours);
    }
    public TimeEntry(long id, long projectId, long userId, LocalDate entryDate, int hours) {
        this.setId(id);
        this.setProjectId(projectId);
        this.setUserId(userId);
        this.setDate(entryDate);
        this.setHours(hours);
    }

    public TimeEntry() {

    }

    public void setId(long id) {
        this.id=id;
    }
    public long getId() {
        return this.id;
    }
    public void setProjectId(long id) {this.projectId=id;}
    public long getProjectId() {return this.projectId;}
    public void setUserId(long id) {this.userId=id;}
    public long getUserId() {return this.userId;}
    public void setDate(LocalDate date) {this.date=date;}
    public LocalDate getDate() {return this.date;}
    public void setHours(int hours) {this.hours=hours;}
    public long getHours() {return this.hours;}

    public TimeEntry update(TimeEntry dataToChange)
    {
        this.setProjectId(dataToChange.projectId);
        this.setUserId(dataToChange.userId);
        this.setDate(dataToChange.date);
        this.setHours(dataToChange.hours);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TimeEntry timeEntry = (TimeEntry) o;

        if (id != timeEntry.id) return false;
        if (projectId != timeEntry.projectId) return false;
        if (userId != timeEntry.userId) return false;
        if (hours != timeEntry.hours) return false;
        return date != null ? date.equals(timeEntry.date) : timeEntry.date == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (int) (projectId ^ (projectId >>> 32));
        result = 31 * result + (int) (userId ^ (userId >>> 32));
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = (int) (31 * result + hours);
        return result;
    }

    @Override
    public String toString() {
        return "TimeEntry{" +
                "id=" + id +
                ", projectId=" + projectId +
                ", userId=" + userId +
                ", date='" + date + '\'' +
                ", hours=" + hours +
                '}';
    }

}
