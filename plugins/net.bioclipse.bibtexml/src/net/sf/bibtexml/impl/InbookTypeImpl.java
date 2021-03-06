/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.bibtexml.impl;

import java.math.BigInteger;

import javax.xml.datatype.XMLGregorianCalendar;

import net.sf.bibtexml.BibtexmlPackage;
import net.sf.bibtexml.InbookType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inbook Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.bibtexml.impl.InbookTypeImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link net.sf.bibtexml.impl.InbookTypeImpl#getEditor <em>Editor</em>}</li>
 *   <li>{@link net.sf.bibtexml.impl.InbookTypeImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link net.sf.bibtexml.impl.InbookTypeImpl#getChapter <em>Chapter</em>}</li>
 *   <li>{@link net.sf.bibtexml.impl.InbookTypeImpl#getPages <em>Pages</em>}</li>
 *   <li>{@link net.sf.bibtexml.impl.InbookTypeImpl#getPages1 <em>Pages1</em>}</li>
 *   <li>{@link net.sf.bibtexml.impl.InbookTypeImpl#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link net.sf.bibtexml.impl.InbookTypeImpl#getYear <em>Year</em>}</li>
 *   <li>{@link net.sf.bibtexml.impl.InbookTypeImpl#getVolume <em>Volume</em>}</li>
 *   <li>{@link net.sf.bibtexml.impl.InbookTypeImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link net.sf.bibtexml.impl.InbookTypeImpl#getSeries <em>Series</em>}</li>
 *   <li>{@link net.sf.bibtexml.impl.InbookTypeImpl#getType <em>Type</em>}</li>
 *   <li>{@link net.sf.bibtexml.impl.InbookTypeImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link net.sf.bibtexml.impl.InbookTypeImpl#getEdition <em>Edition</em>}</li>
 *   <li>{@link net.sf.bibtexml.impl.InbookTypeImpl#getMonth <em>Month</em>}</li>
 *   <li>{@link net.sf.bibtexml.impl.InbookTypeImpl#getNote <em>Note</em>}</li>
 *   <li>{@link net.sf.bibtexml.impl.InbookTypeImpl#getKey <em>Key</em>}</li>
 *   <li>{@link net.sf.bibtexml.impl.InbookTypeImpl#getCrossref <em>Crossref</em>}</li>
 *   <li>{@link net.sf.bibtexml.impl.InbookTypeImpl#getDoi <em>Doi</em>}</li>
 *   <li>{@link net.sf.bibtexml.impl.InbookTypeImpl#getUrl <em>Url</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InbookTypeImpl extends EObjectImpl implements InbookType {
    /**
     * The default value of the '{@link #getAuthor() <em>Author</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAuthor()
     * @generated
     * @ordered
     */
    protected static final String AUTHOR_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAuthor() <em>Author</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAuthor()
     * @generated
     * @ordered
     */
    protected String author = AUTHOR_EDEFAULT;

    /**
     * The default value of the '{@link #getEditor() <em>Editor</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEditor()
     * @generated
     * @ordered
     */
    protected static final String EDITOR_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEditor() <em>Editor</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEditor()
     * @generated
     * @ordered
     */
    protected String editor = EDITOR_EDEFAULT;

    /**
     * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTitle()
     * @generated
     * @ordered
     */
    protected static final String TITLE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTitle()
     * @generated
     * @ordered
     */
    protected String title = TITLE_EDEFAULT;

    /**
     * The default value of the '{@link #getChapter() <em>Chapter</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getChapter()
     * @generated
     * @ordered
     */
    protected static final BigInteger CHAPTER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getChapter() <em>Chapter</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getChapter()
     * @generated
     * @ordered
     */
    protected BigInteger chapter = CHAPTER_EDEFAULT;

    /**
     * The default value of the '{@link #getPages() <em>Pages</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPages()
     * @generated
     * @ordered
     */
    protected static final String PAGES_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPages() <em>Pages</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPages()
     * @generated
     * @ordered
     */
    protected String pages = PAGES_EDEFAULT;

    /**
     * The default value of the '{@link #getPages1() <em>Pages1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPages1()
     * @generated
     * @ordered
     */
    protected static final String PAGES1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPages1() <em>Pages1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPages1()
     * @generated
     * @ordered
     */
    protected String pages1 = PAGES1_EDEFAULT;

    /**
     * The default value of the '{@link #getPublisher() <em>Publisher</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPublisher()
     * @generated
     * @ordered
     */
    protected static final String PUBLISHER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPublisher() <em>Publisher</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPublisher()
     * @generated
     * @ordered
     */
    protected String publisher = PUBLISHER_EDEFAULT;

    /**
     * The default value of the '{@link #getYear() <em>Year</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getYear()
     * @generated
     * @ordered
     */
    protected static final XMLGregorianCalendar YEAR_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getYear() <em>Year</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getYear()
     * @generated
     * @ordered
     */
    protected XMLGregorianCalendar year = YEAR_EDEFAULT;

    /**
     * The default value of the '{@link #getVolume() <em>Volume</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVolume()
     * @generated
     * @ordered
     */
    protected static final String VOLUME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVolume() <em>Volume</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVolume()
     * @generated
     * @ordered
     */
    protected String volume = VOLUME_EDEFAULT;

    /**
     * The default value of the '{@link #getNumber() <em>Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNumber()
     * @generated
     * @ordered
     */
    protected static final String NUMBER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getNumber() <em>Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNumber()
     * @generated
     * @ordered
     */
    protected String number = NUMBER_EDEFAULT;

    /**
     * The default value of the '{@link #getSeries() <em>Series</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSeries()
     * @generated
     * @ordered
     */
    protected static final String SERIES_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSeries() <em>Series</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSeries()
     * @generated
     * @ordered
     */
    protected String series = SERIES_EDEFAULT;

    /**
     * The default value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected static final String TYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected String type = TYPE_EDEFAULT;

    /**
     * The default value of the '{@link #getAddress() <em>Address</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAddress()
     * @generated
     * @ordered
     */
    protected static final String ADDRESS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAddress() <em>Address</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAddress()
     * @generated
     * @ordered
     */
    protected String address = ADDRESS_EDEFAULT;

    /**
     * The default value of the '{@link #getEdition() <em>Edition</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEdition()
     * @generated
     * @ordered
     */
    protected static final String EDITION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEdition() <em>Edition</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEdition()
     * @generated
     * @ordered
     */
    protected String edition = EDITION_EDEFAULT;

    /**
     * The default value of the '{@link #getMonth() <em>Month</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMonth()
     * @generated
     * @ordered
     */
    protected static final Object MONTH_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMonth() <em>Month</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMonth()
     * @generated
     * @ordered
     */
    protected Object month = MONTH_EDEFAULT;

    /**
     * The default value of the '{@link #getNote() <em>Note</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNote()
     * @generated
     * @ordered
     */
    protected static final String NOTE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getNote() <em>Note</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNote()
     * @generated
     * @ordered
     */
    protected String note = NOTE_EDEFAULT;

    /**
     * The default value of the '{@link #getKey() <em>Key</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKey()
     * @generated
     * @ordered
     */
    protected static final String KEY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKey() <em>Key</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKey()
     * @generated
     * @ordered
     */
    protected String key = KEY_EDEFAULT;

    /**
     * The default value of the '{@link #getCrossref() <em>Crossref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCrossref()
     * @generated
     * @ordered
     */
    protected static final String CROSSREF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCrossref() <em>Crossref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCrossref()
     * @generated
     * @ordered
     */
    protected String crossref = CROSSREF_EDEFAULT;

    /**
     * The default value of the '{@link #getDoi() <em>Doi</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDoi()
     * @generated
     * @ordered
     */
    protected static final String DOI_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDoi() <em>Doi</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDoi()
     * @generated
     * @ordered
     */
    protected String doi = DOI_EDEFAULT;

    /**
     * The default value of the '{@link #getUrl() <em>Url</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUrl()
     * @generated
     * @ordered
     */
    protected static final String URL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getUrl() <em>Url</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUrl()
     * @generated
     * @ordered
     */
    protected String url = URL_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected InbookTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return BibtexmlPackage.Literals.INBOOK_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getAuthor() {
        return author;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAuthor(String newAuthor) {
        String oldAuthor = author;
        author = newAuthor;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BibtexmlPackage.INBOOK_TYPE__AUTHOR, oldAuthor, author));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getEditor() {
        return editor;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEditor(String newEditor) {
        String oldEditor = editor;
        editor = newEditor;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BibtexmlPackage.INBOOK_TYPE__EDITOR, oldEditor, editor));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getTitle() {
        return title;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTitle(String newTitle) {
        String oldTitle = title;
        title = newTitle;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BibtexmlPackage.INBOOK_TYPE__TITLE, oldTitle, title));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BigInteger getChapter() {
        return chapter;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setChapter(BigInteger newChapter) {
        BigInteger oldChapter = chapter;
        chapter = newChapter;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BibtexmlPackage.INBOOK_TYPE__CHAPTER, oldChapter, chapter));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getPages() {
        return pages;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPages(String newPages) {
        String oldPages = pages;
        pages = newPages;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BibtexmlPackage.INBOOK_TYPE__PAGES, oldPages, pages));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getPages1() {
        return pages1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPages1(String newPages1) {
        String oldPages1 = pages1;
        pages1 = newPages1;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BibtexmlPackage.INBOOK_TYPE__PAGES1, oldPages1, pages1));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getPublisher() {
        return publisher;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPublisher(String newPublisher) {
        String oldPublisher = publisher;
        publisher = newPublisher;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BibtexmlPackage.INBOOK_TYPE__PUBLISHER, oldPublisher, publisher));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public XMLGregorianCalendar getYear() {
        return year;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setYear(XMLGregorianCalendar newYear) {
        XMLGregorianCalendar oldYear = year;
        year = newYear;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BibtexmlPackage.INBOOK_TYPE__YEAR, oldYear, year));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getVolume() {
        return volume;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setVolume(String newVolume) {
        String oldVolume = volume;
        volume = newVolume;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BibtexmlPackage.INBOOK_TYPE__VOLUME, oldVolume, volume));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getNumber() {
        return number;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setNumber(String newNumber) {
        String oldNumber = number;
        number = newNumber;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BibtexmlPackage.INBOOK_TYPE__NUMBER, oldNumber, number));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getSeries() {
        return series;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSeries(String newSeries) {
        String oldSeries = series;
        series = newSeries;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BibtexmlPackage.INBOOK_TYPE__SERIES, oldSeries, series));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getType() {
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setType(String newType) {
        String oldType = type;
        type = newType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BibtexmlPackage.INBOOK_TYPE__TYPE, oldType, type));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getAddress() {
        return address;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAddress(String newAddress) {
        String oldAddress = address;
        address = newAddress;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BibtexmlPackage.INBOOK_TYPE__ADDRESS, oldAddress, address));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getEdition() {
        return edition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEdition(String newEdition) {
        String oldEdition = edition;
        edition = newEdition;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BibtexmlPackage.INBOOK_TYPE__EDITION, oldEdition, edition));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getMonth() {
        return month;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMonth(Object newMonth) {
        Object oldMonth = month;
        month = newMonth;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BibtexmlPackage.INBOOK_TYPE__MONTH, oldMonth, month));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getNote() {
        return note;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setNote(String newNote) {
        String oldNote = note;
        note = newNote;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BibtexmlPackage.INBOOK_TYPE__NOTE, oldNote, note));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getKey() {
        return key;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setKey(String newKey) {
        String oldKey = key;
        key = newKey;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BibtexmlPackage.INBOOK_TYPE__KEY, oldKey, key));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getCrossref() {
        return crossref;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCrossref(String newCrossref) {
        String oldCrossref = crossref;
        crossref = newCrossref;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BibtexmlPackage.INBOOK_TYPE__CROSSREF, oldCrossref, crossref));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getDoi() {
        return doi;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDoi(String newDoi) {
        String oldDoi = doi;
        doi = newDoi;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BibtexmlPackage.INBOOK_TYPE__DOI, oldDoi, doi));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getUrl() {
        return url;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setUrl(String newUrl) {
        String oldUrl = url;
        url = newUrl;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, BibtexmlPackage.INBOOK_TYPE__URL, oldUrl, url));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case BibtexmlPackage.INBOOK_TYPE__AUTHOR:
                return getAuthor();
            case BibtexmlPackage.INBOOK_TYPE__EDITOR:
                return getEditor();
            case BibtexmlPackage.INBOOK_TYPE__TITLE:
                return getTitle();
            case BibtexmlPackage.INBOOK_TYPE__CHAPTER:
                return getChapter();
            case BibtexmlPackage.INBOOK_TYPE__PAGES:
                return getPages();
            case BibtexmlPackage.INBOOK_TYPE__PAGES1:
                return getPages1();
            case BibtexmlPackage.INBOOK_TYPE__PUBLISHER:
                return getPublisher();
            case BibtexmlPackage.INBOOK_TYPE__YEAR:
                return getYear();
            case BibtexmlPackage.INBOOK_TYPE__VOLUME:
                return getVolume();
            case BibtexmlPackage.INBOOK_TYPE__NUMBER:
                return getNumber();
            case BibtexmlPackage.INBOOK_TYPE__SERIES:
                return getSeries();
            case BibtexmlPackage.INBOOK_TYPE__TYPE:
                return getType();
            case BibtexmlPackage.INBOOK_TYPE__ADDRESS:
                return getAddress();
            case BibtexmlPackage.INBOOK_TYPE__EDITION:
                return getEdition();
            case BibtexmlPackage.INBOOK_TYPE__MONTH:
                return getMonth();
            case BibtexmlPackage.INBOOK_TYPE__NOTE:
                return getNote();
            case BibtexmlPackage.INBOOK_TYPE__KEY:
                return getKey();
            case BibtexmlPackage.INBOOK_TYPE__CROSSREF:
                return getCrossref();
            case BibtexmlPackage.INBOOK_TYPE__DOI:
                return getDoi();
            case BibtexmlPackage.INBOOK_TYPE__URL:
                return getUrl();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case BibtexmlPackage.INBOOK_TYPE__AUTHOR:
                setAuthor((String)newValue);
                return;
            case BibtexmlPackage.INBOOK_TYPE__EDITOR:
                setEditor((String)newValue);
                return;
            case BibtexmlPackage.INBOOK_TYPE__TITLE:
                setTitle((String)newValue);
                return;
            case BibtexmlPackage.INBOOK_TYPE__CHAPTER:
                setChapter((BigInteger)newValue);
                return;
            case BibtexmlPackage.INBOOK_TYPE__PAGES:
                setPages((String)newValue);
                return;
            case BibtexmlPackage.INBOOK_TYPE__PAGES1:
                setPages1((String)newValue);
                return;
            case BibtexmlPackage.INBOOK_TYPE__PUBLISHER:
                setPublisher((String)newValue);
                return;
            case BibtexmlPackage.INBOOK_TYPE__YEAR:
                setYear((XMLGregorianCalendar)newValue);
                return;
            case BibtexmlPackage.INBOOK_TYPE__VOLUME:
                setVolume((String)newValue);
                return;
            case BibtexmlPackage.INBOOK_TYPE__NUMBER:
                setNumber((String)newValue);
                return;
            case BibtexmlPackage.INBOOK_TYPE__SERIES:
                setSeries((String)newValue);
                return;
            case BibtexmlPackage.INBOOK_TYPE__TYPE:
                setType((String)newValue);
                return;
            case BibtexmlPackage.INBOOK_TYPE__ADDRESS:
                setAddress((String)newValue);
                return;
            case BibtexmlPackage.INBOOK_TYPE__EDITION:
                setEdition((String)newValue);
                return;
            case BibtexmlPackage.INBOOK_TYPE__MONTH:
                setMonth(newValue);
                return;
            case BibtexmlPackage.INBOOK_TYPE__NOTE:
                setNote((String)newValue);
                return;
            case BibtexmlPackage.INBOOK_TYPE__KEY:
                setKey((String)newValue);
                return;
            case BibtexmlPackage.INBOOK_TYPE__CROSSREF:
                setCrossref((String)newValue);
                return;
            case BibtexmlPackage.INBOOK_TYPE__DOI:
                setDoi((String)newValue);
                return;
            case BibtexmlPackage.INBOOK_TYPE__URL:
                setUrl((String)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case BibtexmlPackage.INBOOK_TYPE__AUTHOR:
                setAuthor(AUTHOR_EDEFAULT);
                return;
            case BibtexmlPackage.INBOOK_TYPE__EDITOR:
                setEditor(EDITOR_EDEFAULT);
                return;
            case BibtexmlPackage.INBOOK_TYPE__TITLE:
                setTitle(TITLE_EDEFAULT);
                return;
            case BibtexmlPackage.INBOOK_TYPE__CHAPTER:
                setChapter(CHAPTER_EDEFAULT);
                return;
            case BibtexmlPackage.INBOOK_TYPE__PAGES:
                setPages(PAGES_EDEFAULT);
                return;
            case BibtexmlPackage.INBOOK_TYPE__PAGES1:
                setPages1(PAGES1_EDEFAULT);
                return;
            case BibtexmlPackage.INBOOK_TYPE__PUBLISHER:
                setPublisher(PUBLISHER_EDEFAULT);
                return;
            case BibtexmlPackage.INBOOK_TYPE__YEAR:
                setYear(YEAR_EDEFAULT);
                return;
            case BibtexmlPackage.INBOOK_TYPE__VOLUME:
                setVolume(VOLUME_EDEFAULT);
                return;
            case BibtexmlPackage.INBOOK_TYPE__NUMBER:
                setNumber(NUMBER_EDEFAULT);
                return;
            case BibtexmlPackage.INBOOK_TYPE__SERIES:
                setSeries(SERIES_EDEFAULT);
                return;
            case BibtexmlPackage.INBOOK_TYPE__TYPE:
                setType(TYPE_EDEFAULT);
                return;
            case BibtexmlPackage.INBOOK_TYPE__ADDRESS:
                setAddress(ADDRESS_EDEFAULT);
                return;
            case BibtexmlPackage.INBOOK_TYPE__EDITION:
                setEdition(EDITION_EDEFAULT);
                return;
            case BibtexmlPackage.INBOOK_TYPE__MONTH:
                setMonth(MONTH_EDEFAULT);
                return;
            case BibtexmlPackage.INBOOK_TYPE__NOTE:
                setNote(NOTE_EDEFAULT);
                return;
            case BibtexmlPackage.INBOOK_TYPE__KEY:
                setKey(KEY_EDEFAULT);
                return;
            case BibtexmlPackage.INBOOK_TYPE__CROSSREF:
                setCrossref(CROSSREF_EDEFAULT);
                return;
            case BibtexmlPackage.INBOOK_TYPE__DOI:
                setDoi(DOI_EDEFAULT);
                return;
            case BibtexmlPackage.INBOOK_TYPE__URL:
                setUrl(URL_EDEFAULT);
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case BibtexmlPackage.INBOOK_TYPE__AUTHOR:
                return AUTHOR_EDEFAULT == null ? author != null : !AUTHOR_EDEFAULT.equals(author);
            case BibtexmlPackage.INBOOK_TYPE__EDITOR:
                return EDITOR_EDEFAULT == null ? editor != null : !EDITOR_EDEFAULT.equals(editor);
            case BibtexmlPackage.INBOOK_TYPE__TITLE:
                return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
            case BibtexmlPackage.INBOOK_TYPE__CHAPTER:
                return CHAPTER_EDEFAULT == null ? chapter != null : !CHAPTER_EDEFAULT.equals(chapter);
            case BibtexmlPackage.INBOOK_TYPE__PAGES:
                return PAGES_EDEFAULT == null ? pages != null : !PAGES_EDEFAULT.equals(pages);
            case BibtexmlPackage.INBOOK_TYPE__PAGES1:
                return PAGES1_EDEFAULT == null ? pages1 != null : !PAGES1_EDEFAULT.equals(pages1);
            case BibtexmlPackage.INBOOK_TYPE__PUBLISHER:
                return PUBLISHER_EDEFAULT == null ? publisher != null : !PUBLISHER_EDEFAULT.equals(publisher);
            case BibtexmlPackage.INBOOK_TYPE__YEAR:
                return YEAR_EDEFAULT == null ? year != null : !YEAR_EDEFAULT.equals(year);
            case BibtexmlPackage.INBOOK_TYPE__VOLUME:
                return VOLUME_EDEFAULT == null ? volume != null : !VOLUME_EDEFAULT.equals(volume);
            case BibtexmlPackage.INBOOK_TYPE__NUMBER:
                return NUMBER_EDEFAULT == null ? number != null : !NUMBER_EDEFAULT.equals(number);
            case BibtexmlPackage.INBOOK_TYPE__SERIES:
                return SERIES_EDEFAULT == null ? series != null : !SERIES_EDEFAULT.equals(series);
            case BibtexmlPackage.INBOOK_TYPE__TYPE:
                return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
            case BibtexmlPackage.INBOOK_TYPE__ADDRESS:
                return ADDRESS_EDEFAULT == null ? address != null : !ADDRESS_EDEFAULT.equals(address);
            case BibtexmlPackage.INBOOK_TYPE__EDITION:
                return EDITION_EDEFAULT == null ? edition != null : !EDITION_EDEFAULT.equals(edition);
            case BibtexmlPackage.INBOOK_TYPE__MONTH:
                return MONTH_EDEFAULT == null ? month != null : !MONTH_EDEFAULT.equals(month);
            case BibtexmlPackage.INBOOK_TYPE__NOTE:
                return NOTE_EDEFAULT == null ? note != null : !NOTE_EDEFAULT.equals(note);
            case BibtexmlPackage.INBOOK_TYPE__KEY:
                return KEY_EDEFAULT == null ? key != null : !KEY_EDEFAULT.equals(key);
            case BibtexmlPackage.INBOOK_TYPE__CROSSREF:
                return CROSSREF_EDEFAULT == null ? crossref != null : !CROSSREF_EDEFAULT.equals(crossref);
            case BibtexmlPackage.INBOOK_TYPE__DOI:
                return DOI_EDEFAULT == null ? doi != null : !DOI_EDEFAULT.equals(doi);
            case BibtexmlPackage.INBOOK_TYPE__URL:
                return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (author: ");
        result.append(author);
        result.append(", editor: ");
        result.append(editor);
        result.append(", title: ");
        result.append(title);
        result.append(", chapter: ");
        result.append(chapter);
        result.append(", pages: ");
        result.append(pages);
        result.append(", pages1: ");
        result.append(pages1);
        result.append(", publisher: ");
        result.append(publisher);
        result.append(", year: ");
        result.append(year);
        result.append(", volume: ");
        result.append(volume);
        result.append(", number: ");
        result.append(number);
        result.append(", series: ");
        result.append(series);
        result.append(", type: ");
        result.append(type);
        result.append(", address: ");
        result.append(address);
        result.append(", edition: ");
        result.append(edition);
        result.append(", month: ");
        result.append(month);
        result.append(", note: ");
        result.append(note);
        result.append(", key: ");
        result.append(key);
        result.append(", crossref: ");
        result.append(crossref);
        result.append(", doi: ");
        result.append(doi);
        result.append(", url: ");
        result.append(url);
        result.append(')');
        return result.toString();
    }

} //InbookTypeImpl
