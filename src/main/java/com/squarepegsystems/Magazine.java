package com.squarepegsystems;

import org.joda.beans.Bean;
import org.joda.beans.gen.BeanDefinition;
import org.joda.beans.gen.PropertyDefinition;
import java.util.Map;
import org.joda.beans.BeanBuilder;
import org.joda.beans.JodaBeanUtils;
import org.joda.beans.MetaBean;
import org.joda.beans.MetaProperty;
import org.joda.beans.Property;
import org.joda.beans.impl.direct.DirectBeanBuilder;
import org.joda.beans.impl.direct.DirectMetaBean;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.joda.beans.impl.direct.DirectMetaPropertyMap;

@BeanDefinition
public class Magazine implements Bean {

    @PropertyDefinition(validate = "notEmpty")
    private  String title;
    //------------------------- AUTOGENERATED START -------------------------
    /**
     * The meta-bean for {@code Magazine}.
     * @return the meta-bean, not null
     */
    public static Magazine.Meta meta() {
        return Magazine.Meta.INSTANCE;
    }

    static {
        MetaBean.register(Magazine.Meta.INSTANCE);
    }

    @Override
    public Magazine.Meta metaBean() {
        return Magazine.Meta.INSTANCE;
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the title.
     * @return the value of the property, not empty
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the title.
     * @param title  the new value of the property, not empty
     */
    public void setTitle(String title) {
        JodaBeanUtils.notEmpty(title, "title");
        this.title = title;
    }

    /**
     * Gets the the {@code title} property.
     * @return the property, not null
     */
    public final Property<String> title() {
        return metaBean().title().createProperty(this);
    }

    //-----------------------------------------------------------------------
    @Override
    public Magazine clone() {
        return JodaBeanUtils.cloneAlways(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == this.getClass()) {
            Magazine other = (Magazine) obj;
            return JodaBeanUtils.equal(getTitle(), other.getTitle());
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = getClass().hashCode();
        hash = hash * 31 + JodaBeanUtils.hashCode(getTitle());
        return hash;
    }

    @Override
    public String toString() {
        StringBuilder buf = new StringBuilder(64);
        buf.append("Magazine{");
        int len = buf.length();
        toString(buf);
        if (buf.length() > len) {
            buf.setLength(buf.length() - 2);
        }
        buf.append('}');
        return buf.toString();
    }

    protected void toString(StringBuilder buf) {
        buf.append("title").append('=').append(JodaBeanUtils.toString(getTitle())).append(',').append(' ');
    }

    //-----------------------------------------------------------------------
    /**
     * The meta-bean for {@code Magazine}.
     */
    public static class Meta extends DirectMetaBean {
        /**
         * The singleton instance of the meta-bean.
         */
        static final Meta INSTANCE = new Meta();

        /**
         * The meta-property for the {@code title} property.
         */
        private final MetaProperty<String> title = DirectMetaProperty.ofReadWrite(
                this, "title", Magazine.class, String.class);
        /**
         * The meta-properties.
         */
        private final Map<String, MetaProperty<?>> metaPropertyMap$ = new DirectMetaPropertyMap(
                this, null,
                "title");

        /**
         * Restricted constructor.
         */
        protected Meta() {
        }

        @Override
        protected MetaProperty<?> metaPropertyGet(String propertyName) {
            switch (propertyName.hashCode()) {
                case 110371416:  // title
                    return title;
            }
            return super.metaPropertyGet(propertyName);
        }

        @Override
        public BeanBuilder<? extends Magazine> builder() {
            return new DirectBeanBuilder<>(new Magazine());
        }

        @Override
        public Class<? extends Magazine> beanType() {
            return Magazine.class;
        }

        @Override
        public Map<String, MetaProperty<?>> metaPropertyMap() {
            return metaPropertyMap$;
        }

        //-----------------------------------------------------------------------
        /**
         * The meta-property for the {@code title} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> title() {
            return title;
        }

        //-----------------------------------------------------------------------
        @Override
        protected Object propertyGet(Bean bean, String propertyName, boolean quiet) {
            switch (propertyName.hashCode()) {
                case 110371416:  // title
                    return ((Magazine) bean).getTitle();
            }
            return super.propertyGet(bean, propertyName, quiet);
        }

        @Override
        protected void propertySet(Bean bean, String propertyName, Object newValue, boolean quiet) {
            switch (propertyName.hashCode()) {
                case 110371416:  // title
                    ((Magazine) bean).setTitle((String) newValue);
                    return;
            }
            super.propertySet(bean, propertyName, newValue, quiet);
        }

        @Override
        protected void validate(Bean bean) {
            JodaBeanUtils.notEmpty(((Magazine) bean).title, "title");
        }

    }

    //-------------------------- AUTOGENERATED END --------------------------
}
