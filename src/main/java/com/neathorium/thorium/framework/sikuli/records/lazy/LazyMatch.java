package com.neathorium.thorium.framework.sikuli.records.lazy;

import com.neathorium.thorium.framework.sikuli.namespaces.extensions.boilers.IRegion;
import com.neathorium.thorium.framework.sikuli.namespaces.extensions.boilers.RegionFunction;
import com.neathorium.thorium.framework.sikuli.records.lazy.filtered.LazyFilteredMatchParameters;
import com.neathorium.thorium.framework.core.abstracts.AbstractLazyResult;
import org.sikuli.script.Match;

import java.util.Map;
import java.util.function.Predicate;

public class LazyMatch extends AbstractLazyResult<LazyFilteredMatchParameters> implements IRegion {
    public LazyMatch(String name, Map<String, LazyFilteredMatchParameters> parameters, Predicate<LazyFilteredMatchParameters> validator) {
        super(name, parameters, validator);
    }

    @Override
    public RegionFunction<Match> get() {
        return region -> null;
    }
}
