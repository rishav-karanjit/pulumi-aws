// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.mq.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetBrokerMaintenanceWindowStartTime {
    private final String dayOfWeek;
    private final String timeOfDay;
    private final String timeZone;

    @CustomType.Constructor
    private GetBrokerMaintenanceWindowStartTime(
        @CustomType.Parameter("dayOfWeek") String dayOfWeek,
        @CustomType.Parameter("timeOfDay") String timeOfDay,
        @CustomType.Parameter("timeZone") String timeZone) {
        this.dayOfWeek = dayOfWeek;
        this.timeOfDay = timeOfDay;
        this.timeZone = timeZone;
    }

    public String dayOfWeek() {
        return this.dayOfWeek;
    }
    public String timeOfDay() {
        return this.timeOfDay;
    }
    public String timeZone() {
        return this.timeZone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBrokerMaintenanceWindowStartTime defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String dayOfWeek;
        private String timeOfDay;
        private String timeZone;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBrokerMaintenanceWindowStartTime defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dayOfWeek = defaults.dayOfWeek;
    	      this.timeOfDay = defaults.timeOfDay;
    	      this.timeZone = defaults.timeZone;
        }

        public Builder dayOfWeek(String dayOfWeek) {
            this.dayOfWeek = Objects.requireNonNull(dayOfWeek);
            return this;
        }
        public Builder timeOfDay(String timeOfDay) {
            this.timeOfDay = Objects.requireNonNull(timeOfDay);
            return this;
        }
        public Builder timeZone(String timeZone) {
            this.timeZone = Objects.requireNonNull(timeZone);
            return this;
        }        public GetBrokerMaintenanceWindowStartTime build() {
            return new GetBrokerMaintenanceWindowStartTime(dayOfWeek, timeOfDay, timeZone);
        }
    }
}